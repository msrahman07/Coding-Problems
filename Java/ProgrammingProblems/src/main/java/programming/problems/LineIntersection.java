package programming.problems;

public class LineIntersection {
    public class Point {
        public double x, y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void setLocation(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public class Line {
        public double slope, yintercept;

        public Line(Point start, Point end) {
            // Slope formula: m = (y2-y1)/(x2-x1) = deltaY/deltaX;
            double deltaY = end.y - start.y;
            double deltaX = end.x - start.x;
            this.slope = deltaY/deltaX;
            this.yintercept = end.y - this.slope*end.x;
        }
    }

    public Point intersection(Point start1, Point end1, Point start2, Point end2) {
        // Rearrange points, if end is before start then swap
        if(start1.x > end1.x) swap(start1, end1);
        if(start2.x > end2.x) swap(start2, end2);
        if(start1.x > start2.x) {
            swap(start1, start2);
            swap(end1, end2);
        }
        // Compute lines including slope and yintercept using all points
        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);

        // if lines are parrallel or same exact line, they inercept only
        // if same yintercept and start2 is on line1
        if(line1.slope == line2.slope) {
            if(line1.yintercept == line2.yintercept && isBetween(start1, start2, end1)) {
                return start2;
            }
            return null;
        }

        // if they have different slope
        // get intersect coordinates
        double intersectX = (line2.yintercept - line1.yintercept) / (line1.slope - line2.slope);
        double intersectY = intersectX * line1.slope + line1.yintercept;
        Point intersection = new Point(intersectX, intersectY);

        // Check if intersection is within two lines
        if(isBetween(start1, intersection, end1) && isBetween(start2, intersection, end2)) {
            return intersection;
        }
        return null;
    }

    private boolean isBetween(Point start, Point middle, Point end) {
        return isBetween(start.x, middle.x, end.x) &&
                isBetween(start.y, middle.y, end.y);
    }
    private boolean isBetween(double start, double middle, double end) {
        if(start < end) {
            return middle <= end && middle >= start;
        } else {
            return middle >= end && middle <= start;
        }
    }
    private void swap(Point one, Point two) {
        double x = one.x;
        double y = one.y;
        one.setLocation(two.x, two.y);
        two.setLocation(x, y);
    }

}
