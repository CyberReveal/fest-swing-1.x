/*
 * Created on Aug 6, 2009
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
 * Copyright @2009-2013 the original author or authors.
 */
package org.fest.swing.core;

import static org.fest.util.Arrays.array;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * Tests for {@link RobotEventGenerator#moveMouse(int, int)}.
 * 
 * @author Alex Ruiz
 */
public class RobotEventGenerator_mouseMove_Test extends RobotEventGenerator_TestCase {
  @Override
  Method[] methodsToMockInRobot() throws Exception {
    return array(methodFromAWTRobot("mouseMove", int.class, int.class));
  }

  @Test
  public void should_move_mouse_to_given_coordinates() {
    final int x = 6;
    final int y = 8;
    new EasyMockTemplate(robot) {
      @Override
      protected void expectations() {
        robot.mouseMove(x, y);
        expectLastCall().once();
      }

      @Override
      protected void codeToTest() {
        eventGenerator.moveMouse(x, y);
      }
    }.run();
  }
}
