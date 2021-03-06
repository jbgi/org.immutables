/*
    Copyright 2013-2014 Immutables.org authors

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.immutables.generate.silly;

import org.immutables.annotation.GenerateDefault;
import org.immutables.annotation.GenerateImmutable;
import org.immutables.annotation.GenerateMarshaled;
import org.immutables.annotation.GenerateMarshaler;
import org.immutables.annotation.GenerateRepository;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Set;

@GenerateImmutable
@GenerateMarshaler
@GenerateRepository
public abstract class SillySubstructure {

  @GenerateDefault
  @GenerateMarshaled("e1")
  public RetentionPolicy enum1() {
    return RetentionPolicy.SOURCE;
  }

  public abstract Set<ElementType> set2();

  public abstract Set<Integer> set3();

  public abstract List<Float> floats4();
}
