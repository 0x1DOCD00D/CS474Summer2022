package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

interface I1{ void f(); }
interface I2 extends I1{}
interface I3 { void g(); }
interface I4 extends I2{ void g(); }
class C1 implements I1  {
    @Override public void f() {}
}
class C2 extends C1 implements I2{}
class C3<T extends I1 & I2> implements I3{
    T field;
    @Override public void g() {field.f();}
}
public class ExplainLinesOfCode {
    public static void main(String[] args) {
        I1 vi1 = new C2(); 	        //line 1
        C2 vc2 = (C2)(new C1());    //line 2
        I3 vi3 = new C3<C2>();      //line 3
        vi3.g();                    //line 4
        I2 vi2 = (C2)vi1;           //line 5
//        I1 vc3 = new C3();          //line 6
    }
}
