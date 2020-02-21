# XU University Workshop - Module 'Minecraft Basics' (Beispiel-Plugin)


## Entwicklungsumgebung

Am einfachsten lässt sich das Plugin mit unserer bereits konfigurierten Web-Umgebung verwerden, diese finden Sie [hier](https://che.openshift.io/f?url=https://raw.githubusercontent.com/XU-Exponential-University/Workshop_WebIDE_Presets/master/java_spigot_BasicListeners/devfile.yaml).

Für Schüler wird empfohlen die `settings.json`-Datei in den `.theia`-Ordner zu schieben, so werden einige, für die Bearbeitung der Aufgaben nicht nötige, Datein verborgen.

## Funktion

Dieses Plugin erstellt mehrere Listener im Spiel. Listener warten auf ein bestimmten Ereigniss und führen dann eine festgelegte Aktion aus. In diesem Fall wird auf `onPlayerJoin` und `onPlayerInteractBlock` gewartet. Nähere Erläuterung finden Sie direkt im Code.

## Verwendung

Um das Plugin zu verwenden muss es einfach nur in den `Plugins`-Ordner einen Spigot-Servers mit der Version `1.8` platziert werden. Beim Start des Servers sollte dann eine entsprechende Mitteilung über die Aktivierung des Plugins in der Konsole erscheinen.

Nun sollte jedes Mal wenn der Server betreten wird eine persönliche Willkommensnachricht im Chat des Spielers erscheinen. Zudem sollte der Spieler durch Verwendung einer Angel Blitze auf dem Block den er aktuell ansieht erzeugen können.

## Sonstiges

Bei Fragen oder Verbesserungsvorschlägen wenden Sie sich bitte an einen der [Contributor](https://github.com/XU-Exponential-University/WorkshopExample_MinecraftBasicListeners/graphs/contributors) oder ihren Ansprechpartner für den Workshop.
