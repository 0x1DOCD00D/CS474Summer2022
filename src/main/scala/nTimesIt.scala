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

object nTimesIt:
  def nTimes[A](input: A)(f: A => A)(N: Int): A =
    N match{
      case x if x <=0 => input
      case _ => nTimes(f(input))(f)(N-1)
    }

  @main def runNtimes =
    println(nTimes(10)((i:Int)=>i+1)(3))
