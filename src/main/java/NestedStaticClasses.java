package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class NestedStaticClasses {
    public class Outer {
        void f(String s){
            System.out.println("f: " + s);
        }
        static class Inner {
            void g(String s){
                System.out.println("g: " + s);
            }
        }
    }
    public static void main(String[] args) {
        new NestedStaticClasses.Outer.Inner();
    }
}
