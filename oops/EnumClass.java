package oops;

/**
 * Enummeration -> in short Enum
 * These are named constants which we create
 * We can not extend enum with any other class --> otherwise enum is basically same as class
 * enum in java extends enum class
 */

 enum Status   {
    Initial, Received, InProgress, Completed, Closed;
 }

public class EnumClass {
    public static void main(String[] args) {
        // Print status enum
        System.out.println(Status.InProgress);

        // Position number of the status
        System.out.println(Status.Closed.ordinal());

        // All values of status
        Status[] sa = Status.values();

        // var => any variable
        // for(var i : sa)   {
        // or
        for(Status i : sa)   {
            System.out.print(i + " ");
        }

        // If-Else
        Status st = Status.Closed;
        if (Status.Initial == st)   {
            System.out.println("Initial status");
        }
        else if (st == Status.Received)   {
            System.out.println("Received status");
        }
        else   {
            System.out.println("Other status");
        }

        // Switch status
        switch(st)   {
            // direct <value>
            case Initial:
                System.out.println("In Initial status");
                break;
            // <enum.value>
            case Status.Received:
                System.out.println("In Received status");
                break;
            case Completed:
                System.out.println("In Completed status");
                break;
            case Closed:
                System.out.println("In Closed status");
                break;
            default:
                System.out.println("In Other status");
        }

        // print this class and super class
        System.out.println(st.getClass());
        System.out.println(st.getClass().getSuperclass());
        System.out.println(st.getClass().getSuperclass().getSuperclass());
        System.out.println(st.getClass().getSuperclass().getSuperclass().getSuperclass());
    }
}
