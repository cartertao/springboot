package com.springboot.tao.demo.jdk.algorithm;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author taozhiwei
 * @date 2020/8/7 10:55
 *
 * 每个节点要么是红色要么是黑色；
 * 根节点是黑色的；
 * 叶子节点（实际上是个空节点，传统叶子节点的孩子）是黑色的；
 * 红色节点的孩子必定是黑色的；
 * 一个节点到其子孙节点所经过的黑色节点数相等，即黑路径相等；
 */
public class RedBlankTree {
    static final String BLANK = "blank";
    static final String RED = "red";
    static Node root;

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(15);
        Node node4 = new Node(30);
        Node node5 = new Node(5);
        Node node6 = new Node(8);
        RedBlankTree redBlankTree = new RedBlankTree();
/*        redBlankTree.twoTreeInsert(node1);
        redBlankTree.twoTreeInsert(node2);
        redBlankTree.twoTreeInsert(node3);
        redBlankTree.twoTreeInsert(node4);
        redBlankTree.twoTreeInsert(node5);
        redBlankTree.twoTreeInsert(node6);*/

        redBlankTree.redBlankInsert(node1);
        redBlankTree.redBlankInsert(node2);
        redBlankTree.redBlankInsert(node3);
        redBlankTree.redBlankInsert(node4);
        redBlankTree.redBlankInsert(node5);
        redBlankTree.redBlankInsert(node6);
        redBlankTree.twoTreeDelete(node3);
        redBlankTree.print();


    }

    public void print() {
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(root);
        while (true) {
            ArrayList<Node> temp = new ArrayList<>();
            nodes.stream().forEach(s -> {
                System.out.print(s.getValue() + s.getColor());
                if (s.getLeft() != null)
                    temp.add(s.getLeft());
                if (s.getRight() != null)
                    temp.add(s.getRight());
            });
            nodes = temp;
            if (temp.size() <= 0) {
                break;
            }
            System.out.println("");
        }
    }

    /**
     * 二叉树插入
     */
    public void twoTreeInsert(Node node) {
        if (root == null) {
            root = node;
        } else {
            setPosition(node);
        }
    }

    /**
     * 二叉树删除
     */
    public Node twoTreeDelete(Node node) {
        Node nextReplaceNode = getNextReplaceNode(node);
        if(nextReplaceNode == null){
            root = null;
        }else{
            node.setValue(nextReplaceNode.getValue());
            node.setData(nextReplaceNode.getData());
            if(nextReplaceNode.getLeft() != null){
                nextReplaceNode.getParent().setRight(node.getLeft());
                node.getLeft().setParent(nextReplaceNode.getParent());
            }else if(nextReplaceNode.getRight() != null){
                nextReplaceNode.getParent().setLeft(nextReplaceNode.getRight());
                nextReplaceNode.getRight().setParent(nextReplaceNode.getParent());
            }else{
                if(isLeftNode(nextReplaceNode))
                    nextReplaceNode.getParent().setLeft(null);
                else
                    nextReplaceNode.getParent().setRight(null);
            }
            nextReplaceNode.setParent(null);
        }
        return nextReplaceNode;
    }

    /**
     * 红黑树删除
     */
    public void redBlankTreeDelete(Node node){
        Node deleteNode = twoTreeDelete(node);
        if(deleteNode.getColor().equals(RED)){
            //如果删除的为红色，则该红色不可能有子树
        }else{
            //删除黑色需要重新平衡
        }
    }

    /**
     * 红黑树插入
     */
    public void redBlankInsert(Node node) {
        if (root == null) {
            node.setColor(BLANK);
            root = node;
        } else {
            setPosition(node);
            insertBalance(node);
        }
    }

    /**
     * 插入平衡
     * 1.如果类节点是黑色，则插入节点设为红色结束
     * 2.如果父节点是红色
     * 2.1叔叔节点是黑色或空
     * 自己设为红色
     * 2.2.1父节点是左孩子
     * ①node是左孩子
     * （1）祖父节点变红
     * （2）父节点变黑
     * （3）祖父节点右旋
     * ②node是右孩子
     * （1）左旋父节点
     * （2）以父节点为插入点，继续平衡
     * 2.2.2父节点是右孩子
     * ①node是左孩子
     * （1）右旋父节点
     * （2）以父节点为插入点，继续平衡
     * ②node是右孩子
     * （1）祖父节点变红
     * （2）父节点变黑
     * （3）祖父节点左旋
     * 2.2叔叔节点是红色
     * 自己设为红色
     * （1）父节点设为黑，
     * （2）叔叔节点设为黑色
     * （3）爷爷节点设为红色
     * （4）指针移动到爷爷节点，对爷爷节点进行平衡
     */
    public void insertBalance(Node node) {
        System.out.println(node.getValue());
        node.setColor(RED);
        if (node.getParent() == null) {
            node.setColor(BLANK);
        } else if (node.getParent().getColor().equals(BLANK)) {
            //node.setColor(RED);
        } else {
            Node uncleNode = this.getUncleNode(node);
            Node parent = node.getParent();
            Node grandfather = parent.getParent();
            if (uncleNode == null || uncleNode.getColor().equals(BLANK)) {
                boolean parentIsLeft = isLeftNode(parent);
                boolean nodeIsLeft = isLeftNode(node);
                if (parentIsLeft) {
                    if (nodeIsLeft) {
                        grandfather.setColor(RED);
                        parent.setColor(BLANK);
                        rightRotate(grandfather);
                    } else {
                        leftRotate(parent);
                        insertBalance(parent);
                    }
                } else {
                    if (nodeIsLeft) {
                        rightRotate(parent);
                        insertBalance(parent);
                    } else {
                        grandfather.setColor(RED);
                        parent.setColor(BLANK);
                        leftRotate(grandfather);
                    }
                }
            } else {
                parent.setColor(BLANK);
                uncleNode.setColor(BLANK);
                grandfather.setColor(RED);
                insertBalance(grandfather);
            }
        }
    }

    /**
     * 二叉树查找插入位置
     */
    public void setPosition(Node node) {
        if (root == null) {
            root = node;
        } else {
            Node compare = root;
            while (true) {
                if (node.getValue() > compare.getValue()) {
                    if (compare.getRight() == null) {
                        compare.setRight(node);
                        node.setParent(compare);
                        break;
                    }
                    compare = compare.getRight();
                } else {
                    if (compare.getLeft() == null) {
                        compare.setLeft(node);
                        node.setParent(compare);
                        break;
                    }
                    compare = compare.getLeft();
                }
            }
        }
    }

    /**
     * right rotate
     * a               a
     * /               /
     * 4               2
     * /  \             / \
     * 2    5    4->    1   4
     * / \                  / \
     * 1   3                3   5
     */
    private void rightRotate(Node node) {
        Node leftNode = node.getLeft();
        if (leftNode != null) {
            Node parent = node.getParent();
            Node leftRightNode = leftNode.getRight();

            leftNode.setRight(node);
            leftNode.setParent(parent);
            if (parent != null) {
                if (isLeftNode(node)) {
                    parent.setLeft(leftNode);
                } else {
                    parent.setRight(leftNode);
                }
            }
            node.setParent(leftNode);
            node.setLeft(leftRightNode);
            if (leftRightNode != null)
                leftRightNode.setParent(node);
            if (leftNode.getParent() == null) {
                root = leftNode;
                root.setColor(BLANK);
            }
        }
    }

    /**
     * left rotate
     * a                      a
     * /                      /
     * 2                      4
     * / \         2->        / \
     * 1   4                  2   5
     * / \                / \
     * 3   5              1   3
     */
    private void leftRotate(Node node) {
        Node rightNode = node.getRight();
        if (rightNode != null) {
            Node parent = node.getParent();
            Node rightLeftNode = rightNode.getLeft();
            rightNode.setParent(node.getParent());
            rightNode.setLeft(node);
            if (parent != null) {
                if (isLeftNode(node)) {
                    parent.setLeft(rightNode);
                } else {
                    parent.setRight(rightNode);
                }
            }
            node.setParent(rightNode);
            node.setRight(rightLeftNode);
            if (rightLeftNode != null)
                rightLeftNode.setParent(node);
            if (rightNode.getParent() == null) {
                root = rightNode;
                root.setColor(BLANK);
            }
        }
    }

    private Node getUncleNode(Node node) {
        Node parent = node.getParent();
        Node grandfather = parent.getParent();
        if (grandfather != null) {
            if (grandfather.getLeft() == parent)
                return grandfather.getRight();
            return grandfather.getLeft();
        }
        return null;
    }

    private boolean isLeftNode(Node node) {
        return node.getParent().getLeft() == node ? true : false;
    }

    /**
     * 得到比该节点大的下一个节点
     */
    private Node getNextReplaceNode(Node node) {
        //查找右边比它大一点的值
        Node right = node.getRight();
        if (right != null) {
            while (true) {
                if (right.getLeft() != null) {
                    right = right.getLeft();
                } else {
                    return right;
                }
            }
        }
        //查找左边比它小一点的值
        Node left = node.getLeft();
        if (left != null) {
            while (true) {
                if (left.getRight() != null) {
                    left = left.getRight();
                } else {
                    return left;
                }
            }
        }
        if(node.getParent() != null){
            //删除自己
            return node;
        }else{
            //删除的是根节点
            return null;
        }
    }
}

@Data
class Node{
    private Node parent;
    private Node left;
    private Node right;
    private String color;
    private int value;
    private String data;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "parent=" + parent +
                ", left=" + left +
                ", right=" + right +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}
