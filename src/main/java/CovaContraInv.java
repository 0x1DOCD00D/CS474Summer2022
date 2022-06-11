package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */
import java.util.*;
public class CovaContraInv {
    class CC1{}
    class CC2 extends CC1{}
    class CC3 extends CC2{}
    class CC4 extends CC3{}
    class CC5 extends CC4{}

    public void f(){
        List<? extends CC3> le = new ArrayList<CC5>();
//        le.add(new CC4());
        le.add(null);
        CC1 c = le.get(0);
//        CC5 c1 = le.get(0);
        ArrayList<? super CC3> ls = new ArrayList<CC2>();
        ls.get(0);
//        CC1 cc = ls.get(0);
        ls.add(new CC3());
    }

    public static void main(String[] args) {
        new CovaContraInv().f();
    }

}
