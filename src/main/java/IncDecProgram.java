package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class IncDecProgram {
    public static int f(int j) {
        if (j == 3) { //line 1
            j = --j + ++j; //line 2
        }
        return j++; //line 3
    }

    public static void main(String[] args) {
        int j = 0, sum = 0;
        for (int i = 0; i < 5; i++) {
            j = i * f(j); //line 4
            sum += j; //line 5
        }
        System.out.println(j + ", " + sum);
    }
}
