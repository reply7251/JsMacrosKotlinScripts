cd Macros
mklink /D kotlin "%~dp0/scripts"
cd ../LanguageExtensions
mklink /H ScriptDefs.jar "%~dp0/ScriptDefs/build/libs/ScriptDefs.jar"
