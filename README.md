# Data structures

Java exercises organized as separate Eclipse projects, rather than one application.

## Where to start

- [Binary search tree demo](Exe/src/binary_research_tree/Demo.java): inserts integers into a tree, prints it, and performs lookups.
- [Queues and stacks](Pila/src): exercises in the `ES1` and `Es2_Pila` packages.
- [Tree implementations](Trees/src): binary trees, generic variants, and a red-black tree.
- [Graph examples](Grafi/src): JGraphT examples.
- [Coding exercises](LeatCode/src): problems including palindrome checks, duplicate removal, and two sum.

## Opening the exercises

Import the individual folders containing `.project` files into Eclipse as existing projects; do not use the checked-in `.metadata` directory as your own workspace.

Check the selected project's `.classpath` before running a demo. For example, [Exe/.classpath](Exe/.classpath) targets JavaSE-17. [Grafi/.classpath](Grafi/.classpath) references JGraphT 1.5.1 and jheaps 0.13 through absolute paths on the original author's machine; those library paths must be updated for your environment before the graph examples can build.
