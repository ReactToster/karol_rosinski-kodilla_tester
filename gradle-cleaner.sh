rm ./build/libs/*.jar
./gradlew build
mkdir -p ~/projects
for file in ./build/libs/*.jar ; do
    if [ -e "$file"  ];
        then
          cp "$file" ~/projects
        else
          echo "Compile Error: File not found!"
    fi
done
