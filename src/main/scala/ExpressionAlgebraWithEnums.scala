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

object ExpressionAlgebraWithEnums:
  enum ExpressionAlg:
    case Value(i:Int)
    case Add(o1:Value, o2:Value)

    def evaluator(exp: ExpressionAlg): Int = exp match
      case Value(v) => v
      case Add(o1,o2) => evaluator(o1)+evaluator(o2)

  @main def RunExpAlg =
    import ExpressionAlg.*
    val exp:ExpressionAlg = Add(Value(1), Value(3))
    val res = exp.evaluator(exp)
    println(res)