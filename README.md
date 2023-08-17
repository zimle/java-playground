# Playground

This is a toy project to experiment and keep track of it.

## Code Quality

There are three different tools to enhance code quality:

- [Spotless](https://github.com/diffplug/spotless/tree/main/plugin-gradle) via its gradle plugin.
    See the [build.gradle](/lib/build.gradle) for the current configuration.

- [Checkstyle](https://checkstyle.org/checks.html) with [configuration](/config/checkstyle/google_checks.xml) stolen from [modern-java-practices](https://github.com/binkley/modern-java-practices/tree/master) and adapted:

  - use 4 whitespaces
  - set line lenght to 120 as palantir formatter

  Furthermore, violations are might be fixed by [openrewrite](https://docs.openrewrite.org/running-recipes/popular-recipe-guides/automatically-fix-checkstyle-violations).

- [PMD](https://docs.pmd-code.org/latest/pmd_rules_java.html) with [configuration](/config/pmd/custom-rules.xml) stolen from [modern-java-practices](<https://github.com/binkley/modern-java-practices/tree/master>)
