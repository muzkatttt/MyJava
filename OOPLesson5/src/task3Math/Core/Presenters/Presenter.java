package task3Math.Core.Presenters;

 
import task3Math.Core.Infrastructure.Generator;
import task3Math.Core.Models.Model;
import task3Math.Core.Views.View;
import task3Math.Mathematics.Exceptions.UnacceptableValueException;
import task3Math.Mathematics.Shapes.Circle;
import task3Math.Mathematics.Shapes.Rectangle;
import task3Math.Mathematics.Shapes.Shape;


public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}
