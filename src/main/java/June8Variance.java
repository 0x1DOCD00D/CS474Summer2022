package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class June8Variance {
    public static void main(String[] args) {
        String [] as = new String[10];
        as[0] = "Alex";
        Object [] ao = as;
        ao[1] = 3;

        System.out.println(ao[1]);
    }
}
