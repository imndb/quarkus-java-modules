rm -r target
javac -d target/modules --module-source-path . $(find . -name "*.java")