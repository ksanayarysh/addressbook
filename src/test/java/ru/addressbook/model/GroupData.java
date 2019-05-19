package ru.addressbook.model;

public class GroupData {
    private final int id;
    private final String name;
    private final String header;
    private final String footer;

    public GroupData(String name, String header, String footer, int id) {
        this.name = name;
        this.header = header;
        this.footer = footer;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return  false;
        GroupData groupData = (GroupData) obj;
        if (id != groupData.id) return false;
        return name != null ? name.equals(groupData.name) : groupData.name == null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
