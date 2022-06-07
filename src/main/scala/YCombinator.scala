package com.uic.cs474

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object YCombinator:
//  Y = lambda f. lambda x. f (x x) (lambda f. lambda x. f (x x))
//  Y g = (lambda f. lambda x. f (x x) (lambda f. lambda x. f (x x))) g
//  Y g = lambda x. g (x x) lambda x. g (x x))
//  Y g = g (lambda x. g (x x) lambda x. g (x x))
// Y g = g Y g

  val f: (Int => Int) => Int => Int = (g:Int=>Int)=> (i:Int)=> {
    println(s"calling f with $i")
    if i == 0 then 1 else i*g(i-1)
  }

//  T=>T is the function that performs some computation recursively
  def fixY[T](f: (T=>T)=>T=>T):T=>T =
    (i:T)=>{
      println(s"Input i = $i")
      f(fixY(f))(i)
    }

  @main def runYC =
    println(fixY(f)(5))