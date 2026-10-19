@echo off
chcp 65001 >nul
rem ---- lock JDK 21 for this session ----
set "JAVA_HOME=C:\Users\86178\.jdks\corretto-21.0.12"
set "PATH=%JAVA_HOME%\bin;%PATH%"
cd /d C:\Users\86178\JavaDev\JavaProjects
echo ================= JDK Verification =================
echo.
java -version
echo.
javac -version
echo.
echo JAVA_HOME = %JAVA_HOME%
echo.
echo ---------- where java ----------
where java
echo.
echo ---------- where javac ----------
where javac
echo.
echo Verification finished.
