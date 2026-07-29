@echo off
FSUTIL DIRTY query %SystemDrive% >NUL || (
    PowerShell "Start-Process -FilePath cmd.exe -Args '/C CHDIR /D %CD% & ""%0" %*"' -Verb RunAs"
    EXIT
)

set project=%~dp0
set dest=%*
set project=%project:"=%
set dest=%dest:"=%

java -jar "%project%/symlink.jar" %~dp0 %*

PAUSE
