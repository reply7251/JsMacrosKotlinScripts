cd Macros
mklink /D kotlin "%~dp0/scripts"
cd ../Extensions
mklink /H ScriptDefs.jar "%~dp0/ScriptDefs/build/libs/ScriptDefs.jar"

REM returning back so you could do more stuff with the folder as some people might
REM not notice that its not back to the jsMacros folder
cd ../
