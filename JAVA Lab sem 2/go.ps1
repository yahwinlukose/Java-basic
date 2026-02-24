# Compile and Run Java program with JDBC
param([string]$Program = "OracleDBExample")

Write-Host "Compiling $Program.java..." -ForegroundColor Cyan
javac -cp ojdbc11.jar "$Program.java"

if ($LASTEXITCODE -eq 0) {
    Write-Host "Running $Program..." -ForegroundColor Green
    java -cp "ojdbc11.jar;." $Program
} else {
    Write-Host "Compilation failed!" -ForegroundColor Red
}
