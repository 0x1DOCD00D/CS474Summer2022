package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class May25_Lecture5 {
    interface George {
        class X{
            public int field = 5;
        }
        X createHuman();
    }

    class BringGeorgeIntoBeing implements George{
        @Override
        public X createHuman() {
            return new X();
        }
    }
    public static void main(String[] args) {
        System.out.println(new May25_Lecture5(). new BringGeorgeIntoBeing().createHuman().toString());
    }
}
