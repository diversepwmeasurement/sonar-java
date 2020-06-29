/*
 * SonarQube Java
 * Copyright (C) 2012-2020 SonarSource SA
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
package org.sonar.java.regex;

import java.util.Collections;
import java.util.List;
import org.sonar.java.regex.ast.FlagSet;
import org.sonar.java.regex.ast.RegexTree;

public class RegexParseResult {

  private final RegexTree result;

  private final FlagSet initialFlags;

  private final List<SyntaxError> syntaxErrors;

  private final boolean containsComments;

  public RegexParseResult(RegexTree result, FlagSet initialFlags, List<SyntaxError> syntaxErrors, boolean containsComments) {
    this.result = result;
    this.initialFlags = initialFlags;
    this.syntaxErrors = Collections.unmodifiableList(syntaxErrors);
    this.containsComments = containsComments;
  }

  public RegexTree getResult() {
    return result;
  }

  public FlagSet getInitialFlags() {
    return initialFlags;
  }

  public List<SyntaxError> getSyntaxErrors() {
    return syntaxErrors;
  }

  public boolean hasSyntaxErrors() {
    return !syntaxErrors.isEmpty();
  }

  public boolean containsComments() {
    return containsComments;
  }
}
