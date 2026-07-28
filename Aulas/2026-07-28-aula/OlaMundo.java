void main() {
    int idade = Integer.parseInt(IO.readln("Entre com sua idade: "));
    char sexo = IO.readln("Entre com seu sexo (M ou F): ").toUpperCase().charAt(0);

    // DONE Faça um programa para ler a idade e o sexo de uma pessoa
    // e informe se ela precisa apresentar atestado de reservista

    IO.print("Atestado de Reservista: ");
    IO.println((sexo == 'M' && idade >= 18) ? "Obrigatório" : "Facultativo");
}