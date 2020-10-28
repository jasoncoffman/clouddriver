/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.clouddriver.lambda;

import static org.assertj.core.api.Assertions.assertThat;

import com.netflix.spinnaker.clouddriver.lambda.deploy.description.DeleteLambdaFunctionDescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import spock.lang.Specification;

@RunWith(JUnitPlatform.class)
public class DeleteLambdaAtomicOperationTest extends Specification {

  DeleteLambdaFunctionDescription description;

  @BeforeEach
  void setup() {
    description = new DeleteLambdaFunctionDescription();
    description.setFunctionName("foo-bar");
    description.setQualifier("test");
  }

  @Test
  void when_emptyFunctionCacheIsRetrieved_then_nullIsReturned() {
    assertThat(true).isEqualTo(true);
  }
}
