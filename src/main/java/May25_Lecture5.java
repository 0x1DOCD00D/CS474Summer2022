package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class May25_Lecture5 {
    interface George {
        class X{
            public int field = 5;
        }
        X createHuman();
    }

    interface EmptyInter{}
    interface XWithDefault{
        default void f(){
            System.out.println("default f deom x");
        }
    }
    interface YWithDefault{
        default void f(){
            System.out.println("default f from y");
        }
    }
/*

    interface StaticX {
        static void g();
    }

    interface StaticY extends StaticX{
        static void q();
    }

    class AllStatic implements StaticY{

    }
*/

//    new Wiero().f()
    class Wierdo implements XWithDefault, YWithDefault{
        @Override
        public void f() {
            XWithDefault.super.f();
        }
    }

    interface Igor extends George, EmptyInter {

    }

    interface V{
        void f();
        void g();
    }
    interface W {
        void f();
    }

    class VW implements W, V {
        @Override
        public void g() {
            System.out.println("g is called");
        }

        @Override
        public void f() {
            System.out.println("f is called");
        }
    }
    class BringGeorgeIntoBeing implements Igor{
        @Override
        public X createHuman() {
            return new X();
        }
    }
    public static void main(String[] args) {
        VW vw = new May25_Lecture5(). new VW();
        V v = vw;
        W w = vw;
        System.out.println(v.toString());
        System.out.println(w.toString());
        w.f();
        v.f();
        System.out.println(new May25_Lecture5(). new BringGeorgeIntoBeing().createHuman().toString());
    }
}
