/*
 * Copyright 2014 OSBI Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package web.authentication;

import web.AbstractTestSuite;

/**
 * Created by bugg on 15/01/15.
 */
public class CreateAuthenticationTestSuite extends AbstractTestSuite {


  public CreateAuthenticationTestSuite() {
    this.stepDefinitions.add(new CreateAuthenticationSteps());
    this.jiraid = "SUT-2";
  }
}