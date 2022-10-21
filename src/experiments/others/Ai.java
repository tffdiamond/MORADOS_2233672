package experiments.others;
    public enum Ai { //define an identifier for enum class
        PISO(1), LIMA(5), SAMPU(10), BENTE(20); //enumerates all values

        int val; // classes for all integers inside enum

        Ai(int val) {//get the Ai values
            this.val = val;//refers to the values inside enum class as equal to val
        }
    }