import org.w3c.dom.ls.LSOutput;

public class VerificareParola {
    public static void verificaParola(String parola) {
        boolean lungimeOK = parola.length() >= 8;
        boolean areMajuscula = false;
        boolean areCaracterSpecial = false;

        for (int i = 0; i < parola.length(); i++) {
            char c = parola.charAt(i);

            if (Character.isUpperCase(c)) {
                areMajuscula = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                areCaracterSpecial = true;
            }
        }

        if (!lungimeOK) {
            System.out.println("Parola trebuie sa aiba cel putin 8 caractere.");
        }
        if (!areMajuscula) {
            System.out.println("Parola trebuie sa contina cel putin o litera mare.");
        }
        if (!areCaracterSpecial) {
            System.out.println("Parola trebuie sa contina cel putin un caracter special.");
        }

        if (lungimeOK && areMajuscula && areCaracterSpecial) {
            System.out.println("Parola este valida.");

        }
    }

    public static void main(String[] args) {
        verificaParola("parola");
        verificaParola("Parola123");
        verificaParola("Parola!123");
    }


}
