/*
 * Created on Jul 27, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2010-2013 the original author or authors.
 */
package org.fest.swing.fixture;

import javax.swing.JTextField;

import org.fest.swing.core.Robot;

/**
 * Understands an implementation of {@link AbstractComponentFixture} for testing.
 * 
 * @author Alex Ruiz
 */
class ConcreteComponentFixture extends AbstractComponentFixture<JTextField> {
  public ConcreteComponentFixture(Robot robot, Class<? extends JTextField> type) {
    super(robot, type);
  }

  public ConcreteComponentFixture(Robot robot, JTextField target) {
    super(robot, target);
  }

  public ConcreteComponentFixture(Robot robot, String name, Class<? extends JTextField> type) {
    super(robot, name, type);
  }
}