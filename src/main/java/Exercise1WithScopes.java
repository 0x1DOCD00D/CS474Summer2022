package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */
public class Exercise1WithScopes {
    public int VALUE = 10;
    protected static int OBJVALUE = 1;
    static {
        Exercise1WithScopes.OBJVALUE = new Exercise1WithScopes(3).VALUE * 10;
    }
    public Exercise1WithScopes(int v){ VALUE = v + OBJVALUE; }
    public Exercise1WithScopes(){ VALUE = 1; }
    static {
        Exercise1WithScopes.OBJVALUE *= 2;
    }
    public static class ChildScope extends Exercise1WithScopes {
        protected static int OBJVALUE;
        static {
            OBJVALUE = Exercise1WithScopes.OBJVALUE - 5;
        }
        public ChildScope(){ super(7);}
    }

    public static void main(String[] arg){
        System.out.println(new Exercise1WithScopes(5).VALUE);
        System.out.println(Exercise1WithScopes.OBJVALUE);
        System.out.println(ChildScope.OBJVALUE);
    }
}
