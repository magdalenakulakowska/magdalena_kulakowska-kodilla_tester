del /q build\libs\*.jar
call gradlew build
if exist build\libs\*.jar (
    if not exist C:\project\ (
        mkdir C:\project\
    )

    copy build\libs\*.jar C:\project\
) else (
    echo Error: Compilation failed, .jar not found.
)