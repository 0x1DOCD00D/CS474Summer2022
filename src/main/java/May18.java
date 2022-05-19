package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

import java.util.function.Function;

class RREngine{
    public static int te = 1;
    static {
        int x = te;
    }
    static {
        te = 10;
    }

    static {
        int s = 100;
         {
            te = 100;
        }
    }
    public void f(){
        //String s = name;
/*
        Runnable x = ()->{};
        Runnable x1 = new Function<Int, Int>(){
            @Override
            public Int apply(Int anInt) {
                return null;
            }
        };
*/
/*
        void g(){

        }
*/
    }
}
public class May18 {
    public class RollsRoyce {
        public RollsRoyce(){
           class Dontknow {// engine
                {//combustion
                    {

                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        //new RollsRoyce().new RREngine();
        RREngine v1 = new RREngine();
        RREngine v2 = new RREngine();
        v1.te = 2;
        v2.te = 3;
        System.out.println(v1.te);
    }
}
