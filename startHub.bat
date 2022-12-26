cd ..
cd libraries
set ProjectPath=%~dp0
java -jar selenium-server-standablone-3.141.59.jar -role hub -hubConfig "%ProjectPath%\hub.json"
pause