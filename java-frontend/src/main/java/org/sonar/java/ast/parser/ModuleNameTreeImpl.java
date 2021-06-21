/*
 * SonarQube Java
 * Copyright (C) 2012-2021 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.java.ast.parser;

import org.sonar.plugins.java.api.tree.IdentifierTree;
import org.sonar.plugins.java.api.tree.ModuleNameTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModuleNameTreeImpl extends ListTreeImpl<IdentifierTree> implements ModuleNameTree {

  private ModuleNameTreeImpl(List<IdentifierTree> identifiers) {
    super(identifiers, Collections.emptyList());
  }

  public static ModuleNameTreeImpl emptyList() {
    return new ModuleNameTreeImpl(new ArrayList<>());
  }

}
