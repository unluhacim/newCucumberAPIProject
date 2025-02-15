package Exercise;

    public class Item {
        private String desc;

        public String getDescription() {
            return desc;
        }

        public void setDescription(String desc) {
            this.desc = desc;
        }

        public static void modifyDesc(Item item, String desc) {
            item = new Item();
            item.setDescription(desc);
        }

        public static void main(String[] args) {
            Item it = new Item();
            it.setDescription("Blue");
            Item it2 = new Item();
            it2.setDescription("Red");
            modifyDesc(it, "Green");
            System.out.println(it.getDescription()); //Blue
            System.out.println(it2.getDescription()); //Red
        }
    }

