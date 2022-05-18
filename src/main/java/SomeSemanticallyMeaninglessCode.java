package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class SomeSemanticallyMeaninglessCode {
    public int getVint() {
        int c = 0;
        {
            int c1 = 3;
        }
        class C {
            int c = 1;
        }
        return new C().c;
    }

    public void setVint(int vint) {
        this.vint = vint;
    }

    private int vint = 10;
    public SomeSemanticallyMeaninglessCode(int i){
        vint = i;
    }
    public static void main(String[] args) {

        System.out.println((new SomeSemanticallyMeaninglessCode(20)).getVint());
    }
}
