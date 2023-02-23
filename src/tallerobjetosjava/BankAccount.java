package tallerobjetosjava;

/**
 * Representa una Cuenta bancaria con sus propiedades privada y protegida.
 *
 * @author Lmendoza
 */
public class BankAccount {

    /**
     * Representa el atributo privado accountNumber de la clase BankAccount,
     * tipo de dato: int.
     */
    private int accountNumber;

    /**
     * Representa el atributo protegido activated de la clase BankAccount, tipo
     * de dato: boolean.
     */
    protected boolean activated;

    /**
     * Representa el atributo protegido activated de la clase BankAccount, tipo
     * de dato: boolean.
     */
    protected String status;

    /**
     * Constructor: Crea una instancia de la clase BankAccount.
     */
    public BankAccount() {
    }

    /*
    * Método para obtener el valor del atributo  activated de la clase BankAccount.
    *@return Devuelve el valor  del atributo activated.
     */
    public boolean isActivated() {
        return activated;
    }

    /*
    * Método para asignar  el valor al atributo activated de la clase BankAccount.
    * @param activated: Recibe un boolean y lo asigna al atributo colors.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /*
    * Método para devolver un estado de la cuenta: clase BankAccount.
    * @Condicion: Se recibe el método isActivated y se valida si es true o flase. 
    *@return: retorna el valor de la propiedad status.
     */
    public String accountStatus() {

        if (isActivated())
        {
            return this.status = "activa";
        } else
        {
            return this.status = "inactiva";
        }

    }

}
