/*
 * Copyright 2014 Andrew Reitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package shillelagh;

final class Preconditions {
  static <T> T checkNotNull(T object, String message) {
    if (object == null) {
      throw new NullPointerException(message);
    }

    return object;
  }

  static <T> Table checkTableObject(Class<T> tableClass) {
    Table annotation = tableClass.getAnnotation(Table.class);
    if (annotation == null) {
      throw new IllegalArgumentException(tableClass.getName() + " is not a table object.");
    }

    return annotation;
  }

  private Preconditions() {
    // No instances
  }
}
