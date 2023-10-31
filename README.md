# Oblig3

1. Jeg lagde en ny Reposetori på github med en README.md fil som følger med og la til filene fra oblig2 inn i reposetoriet.
 
2. Jeg satt opp en github-Action inn i reposetoriet. ved at jeg la inn filene med testene før jeg satt opp github-action så viste Github hvilken workflows som passet mitt prosjekt best. Dette er da en default yml fil med navnet: "maven.yml" som jeg valgte som passet min bruk av Maven og java koding.

3. Jeg endret noen åpenbare linjer med kode for at den skulle fungere. Som var å endre den fra setup JDK 17 til JDK 19.
   
4. Jeg fikk kjørt testene men de passerte ikke, så jeg måtte endre på min yml filen min. I erroren jeg fikk så sto det at det var problem med "Update dependency graph" som var en ekstra "run" metode . Ved slike endringer kunne jeg se at github-action kjørte for hver gang jeg comitta endringer i filen til main.
