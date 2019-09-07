package com.jgos.hotelbooker.entity.user;



public enum ReservationStatus {
    WAIT_FOR_CONFIRMATION("Awaiting Verification "),
    WAIT_FOR_PAYMENT("Awaiting Payment"),
    RESERVATION_DONE("Reserved"),
    RESERVATION_REJECTED("Rejected by Hotel"),
    RESERVATION_FINISHED("Realized"),
    UNKNOWN("unknown");

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    ReservationStatus(final String text) {
        this.text = text;
    }

    ReservationStatus() {
    }

    public static ReservationStatus getEnumByString(String code) {
        for (ReservationStatus e : ReservationStatus.values()) {
            if (code.equalsIgnoreCase(e.text)) return e;
        }
        return null;
    }

    /* (non-Javadoc)
         * @see java.lang.Enum#toString()
         */
    @Override
    public String toString() {
        if (text == null) {
            return "error";
        }
        return text;
    }
}

