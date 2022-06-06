package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class NormalAbrupt {
    public static int finallyTest(){
        int x = 3;
        try{
            try{
                ++x;
                if (true & true | false) throw new RuntimeException("Argh!!");
                return x--;
            }
            catch(Throwable e){
                return --x;
            }
            finally {
                ++x;
            }
        } catch(RuntimeException e){
            return x++;
        } finally{
            ++x;
        }
    }
    public static void main (String[] args){
        System.out.println(NormalAbrupt.finallyTest());
    }
}