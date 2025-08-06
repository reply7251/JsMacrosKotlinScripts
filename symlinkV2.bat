@echo off

FSUTIL DIRTY query %SystemDrive% >NUL || (
    PowerShell "Start-Process -FilePath cmd.exe -Args '/C CHDIR /D %CD% & ""%0" %*"' -Verb RunAs"
    EXIT
)
set project=%~dp0
set dest=%*
set project=%project:"=%
set dest=%dest:"=%
if "%dest:~-8%" == "jsMacros" (
	cd "%dest%"
	cd Macros
	rmdir kotlin
	mklink /D kotlin "%project%/scripts"
	cd ../Extensions
	del ScriptDefs.jar
	mklink /H ScriptDefs.jar "%project%/ScriptDefs/build/libs/ScriptDefs.jar"
	echo =================
	echo ==== success ====
	echo =================
) else (
	echo path incorrect, please drop jsMacros folder on to batch
	for %%I in (%dest%) do echo your folder: "%%~nxI"
)

PAUSE
