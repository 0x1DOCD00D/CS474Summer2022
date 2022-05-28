package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */
interface Runnable {
    void run();
}
public class May31 {
    Runnable r1 = ()->System.out.println(this.toString());
	Runnable r2 = ()->System.out.println(toString1());

    public String toString1(){return "Howdy!";}

    public static void main(String[] args) {
//        new May31().r1.run();
//        new May31().r2.run();
        interface OhIGottaDoIt {
            int f();
        }
        OhIGottaDoIt lf = ()->{return 2;};
        System.out.println(lf.f());
    }
}
