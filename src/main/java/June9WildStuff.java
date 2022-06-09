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

class T1{}
class T2 extends T1{}
class T3 extends T2{}
class T4 extends T3{}
class T5 extends T4{}


public class June9WildStuff {
    public void experiment(List<? super T3> lst){
        lst.add(new T3());
        lst.add(new T4());
//        lst.add(new T2());
        Object obj = lst.get(0);
    }
    public static void main(String[] args) {

        ArrayList<Integer> aoi = new ArrayList<Integer>();
        ArrayList<String> aos = new ArrayList<String>();
        aoi.add(3);
//        List<? extends Number> ln = aoi;
        List<? extends Number> ln = aoi;
//        List<? extends Number> lns = aos;
//        ln.add(null);
//        ln.add(new Float(2));
//        ln.add(new Integer(2));
        String name = ln.get(0).getClass().getName();
//        Number x = ln.get(0);
        Object x = ln.get(0);
        System.out.println(name);
    }
}
