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

object June2:
  def infInts(iv: Int): LazyList[Int] = iv #:: infInts(iv+1)

  def map[A,B](container: List[A])(f: A => B): List[B] =
    container match
      case Nil => Nil
      case head :: tail => f(head) :: map(tail)(f)

  @main def runJune2 =
    println(infInts(0).take(10).toList)
    println(map(List(1,2,3))((elem:Int)=>elem.toString.concat((elem+1).toString)))
