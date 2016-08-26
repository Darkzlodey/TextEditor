package com.command;

import com.Text;

public class CommandFactory {
    public Command createCommand(String type, Text text) {
        switch (type) {
            case "count":
                return new Count(text);
            case "groupCount":
                return new GroupCount(text);
            /*case "reverse":
                return new Reverse(text);
            case "countDistinct":
                return new CountDistinct(text);
            case "sort":
                return new SortText(text);
            break;
            case "sortBySize":
                return new SortBySize(text);
            break;
            case "sortDesc":
                return new SortDesc(text);
            break;*/
        }
        return null;
    }
}

