/*
 * Created on Jul 25, 2009
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

import static org.fest.swing.core.MouseButton.LEFT_BUTTON;
import static org.fest.swing.core.MouseButton.MIDDLE_BUTTON;
import static org.fest.swing.core.MouseButton.RIGHT_BUTTON;

/**
 * Provider of the mouse button to click and how many times to click.
 *
 * @author Alex Ruiz
 */
public final class ClickingDataProvider {
  public static Object[][] clickingData() {
    return new Object[][] {
        { LEFT_BUTTON, 1 },
        { LEFT_BUTTON, 2 },
        { MIDDLE_BUTTON, 1 },
        { MIDDLE_BUTTON, 2 },
        { RIGHT_BUTTON, 1 },
        { RIGHT_BUTTON, 2 },
      };
  }

  private ClickingDataProvider() {}
}
