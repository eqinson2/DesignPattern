package com.ericsson.designpattern;


/**
 * Created by eqinson on 2016/10/7.
 */
public class Builder {
}

class Name {

}

class Salutation {

}

class Suffix {

}

final class FullName {
    private final Name lastName;
    private final Name firstName;
    private final Name middleName;
    private final Salutation salutation;
    private final Suffix suffix;

    private FullName(
            final Name newLastName,
            final Name newFirstName,
            final Name newMiddleName,
            final Salutation newSalutation,
            final Suffix newSuffix) {
        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.salutation = newSalutation;
        this.suffix = newSuffix;
    }

    private FullName(FullNameBuilder builder) {
        this.lastName = builder.nestedLastName;
        this.firstName = builder.nestedFirstName;
        this.middleName = builder.nestedMiddleName;
        this.salutation = builder.nestedSalutation;
        this.suffix = builder.nestedSuffix;
    }

    public Name getLastName() {
        return this.lastName;
    }

    public Name getFirstName() {
        return this.firstName;
    }

    public Name getMiddleName() {
        return this.middleName;
    }

    public Salutation getSalutation() {
        return this.salutation;
    }

    public Suffix getSuffix() {
        return this.suffix;
    }

    @Override
    public String toString() {
        return this.salutation + " " + this.firstName + " " + this.middleName
                + this.lastName + ", " + this.suffix;
    }

    public static class FullNameBuilder {
        final Name nestedLastName;
        final Name nestedFirstName;
        Name nestedMiddleName;
        Salutation nestedSalutation;
        Suffix nestedSuffix;

        public FullNameBuilder(
                final Name newLastName, final Name newFirstName) {
            this.nestedLastName = newLastName;
            this.nestedFirstName = newFirstName;
        }

        public FullNameBuilder middleName(final Name newMiddleName) {
            this.nestedMiddleName = newMiddleName;
            return this;
        }

        public FullNameBuilder salutation(final Salutation newSalutation) {
            this.nestedSalutation = newSalutation;
            return this;
        }

        public FullNameBuilder suffix(final Suffix newSuffix) {
            this.nestedSuffix = newSuffix;
            return this;
        }

        public FullName createFullName() {
            return new FullName(
                    nestedLastName, nestedFirstName, nestedMiddleName,
                    nestedSalutation, nestedSuffix);
        }

        public FullName createFullName2() {
            return new FullName(this);
        }
    }
}