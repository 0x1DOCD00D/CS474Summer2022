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
    static int field = 100;
    Runnable r1 = ()->System.out.println(this.toString());
	Runnable r2 = ()->System.out.println(toString1());

    boolean notpure(){
        if(++field > 100){
            return true;
        } else {
            return false;
        }
    }
    boolean notpureeq(){
        if(++field <= 100){
            return false;
        } else {
            return true;
        }
    }

    interface OhIGottaDoIt {
        int f();
    }

    int hof(OhIGottaDoIt someFunc){
        //notpure() -> true
        System.out.println(someFunc.toString() + ", " + someFunc.f());
        return someFunc.f();
    }

    OhIGottaDoIt returnLambdaFunc() {
        return ()->{
            System.out.println("Howdy from the returned function!");
            return 10;
        };
    }

    public String toString1(){return "Howdy!";}

    public static void main(String[] args) {
//        new May31().r1.run();
//        new May31().r2.run();

//        new May31().hof(new May31().returnLambdaFunc());

        new May31().hof(()->{
            int x = 5;
            return x+field;});
/*        OhIGottaDoIt lf = ()->{return 2;};
        System.out.println(lf.f());
*/
    }
}
