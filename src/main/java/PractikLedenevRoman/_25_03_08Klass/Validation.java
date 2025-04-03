package PractikLedenevRoman._25_03_08Klass;

//public class Validation {
//    public class ValidationSystem {
//        private static final Map<Class<?>, Validator<?>> VALIDATOR_MAP = Map.of(
//                String.class, o -> {
//                    String s = (String) o;
//                    if (!s.matches("^[A-Z].*")) {
//                        throw new ValidationFailedException("The string " + s + " is invalid.");
//                    }
//                },
//                Integer.class, o -> {
//                    Integer i = (Integer) o;
//                    if (i < 1 || i > 10) {
//                        throw new ValidationFailedException("The number " + i + " is invalid.");
//                    }
//                },
//                Character.class, o -> {
//                    Character c = (Character) o;
//                    if (c < (int)'0' || c > (int)'9') {
//                        throw new ValidationFailedException("The character " + c + " is invalid.");
//                    }
//                });
//        @SuppressWarnings("unchecked")
//        public <T> void validate(T t) {
//            Validator<T> consumer = (Validator<T>) VALIDATOR_MAP.get(t.getClass());
//            consumer.validate(t);
//        }
//    }
//    public class Main {
//        public static void main(String[] args) {
//            Object o = 10;
//            ValidationSystem validationSystem = new ValidationSystem();
//            validationSystem.validate(o);
//            validationSystem.validate("Hello");
//            validationSystem.validate('5');
//            validationSystem.validate(10);
//        }
//    }
//}
//@FunctionalInterface
//public interface Validator<E> {
//    void validate(E e);
//}