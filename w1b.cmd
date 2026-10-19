@echo off
chcp 65001 >nul
rem ---- lock JDK 21 for this session ----
set "JAVA_HOME=C:\Users\86178\.jdks\corretto-21.0.12"
set "PATH=%JAVA_HOME%\bin;%PATH%"
cd /d C:\Users\86178\JavaDev\JavaProjects
echo ================= Compile all programs =================
javac -encoding UTF-8 *.java
echo (no message above = 0 errors)
echo.
echo ================= Run: TestJava =================
java TestJava
echo.
echo ================= Run: HelloWorld =================
java HelloWorld
echo.
echo Program 1 and Program 2 both finished.
